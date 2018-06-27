/**
* Copyright © 2018 fux. All rights reserved.
*
* @Package: com.manyiaby.rule
* @author: fux
* @date: 2018年6月25日 下午5:31:20
*/

package com.manyiaby.rule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

/**
 * @ClassName: MyselfRule
 * @Description: 如果想用自己的规则 extends
 *               AbstractLoadBalancerRule,参考RandomRule类的实现，然后在这个配置类的bean中返回到容器中
 * @author: fux
 * @date: 2018年6月25日 下午5:31:20
 */
@Configuration
public class MyselfRule {
	@Bean
	public IRule myRule() {
		return new RandomRule(); //
	}
}
