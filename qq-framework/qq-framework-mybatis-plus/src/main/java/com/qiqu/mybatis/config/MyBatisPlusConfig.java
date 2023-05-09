package com.qiqu.mybatis.config;

import cn.hutool.core.util.ArrayUtil;
import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.handler.TenantLineHandler;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.TenantLineInnerInterceptor;
import com.qiqu.commons.utils.AuthInfoHolder;
import lombok.extern.slf4j.Slf4j;
import net.sf.jsqlparser.expression.Expression;
import net.sf.jsqlparser.expression.LongValue;
import net.sf.jsqlparser.expression.StringValue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class MyBatisPlusConfig {

   // 不需要多租户的表
   private static String[] tables = new String[]{"tb_dictionary", "tb_category",
           "undo_log", "tb_application", "tb_company", "tb_resource", "tb_role_resource", "tb_user_role"};


   //注册mybatis的插件
   @Bean
   public MybatisPlusInterceptor mybatisPlusInterceptor() {
      MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
      //分页的插件
      interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL)); // 多租户插件
      interceptor.addInnerInterceptor(new TenantLineInnerInterceptor(new TenantLineHandler() {

         // 获取租户的企业id
         @Override
         public Expression getTenantId() {
            Long companyId = AuthInfoHolder.getCompanyId();
            if (ObjectUtil.isEmpty(companyId)) {
               return null;
            } else {
               return new LongValue(companyId);
            }
         }

         // 设置租户字段
         public String getTenantIdColumn() {
            return "company_id";
         }

         // 这是 default 方法,默认返回 false 表示所有表都需要拼多租户条件
         @Override
         public boolean ignoreTable(String tableName) {
            // 以下几张表不使用多租户
            if (ArrayUtil.containsIgnoreCase(tables, tableName)) {
               return true;
            }
            // 企业id为空不使用多租户
            if (ObjectUtil.isEmpty(getTenantId())) {
               return true;
            }
            return false;
         }
      }));

      return interceptor;
   }

}