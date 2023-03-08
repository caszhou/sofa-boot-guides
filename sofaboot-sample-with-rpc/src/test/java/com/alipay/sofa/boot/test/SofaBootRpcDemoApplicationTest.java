/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alipay.sofa.boot.test;

import com.alipay.sofa.boot.examples.demo.rpc.SofaBootRpcDemoApplication;
import com.alipay.sofa.boot.examples.demo.rpc.bean.PersonService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author liangen
 * @version $Id: SofaBootRpcDemoApplicationTest.java, v 0.1 2018年04月10日 上午10:39 liangen Exp $
 */
@SpringBootTest(classes = SofaBootRpcDemoApplication.class)
public class SofaBootRpcDemoApplicationTest {

    @Autowired
    private PersonService personReferenceBolt;

    @Autowired
    private PersonService personReferenceRest;

    @Test
    public void test() {
        Assertions.assertEquals("hi Bolt!", personReferenceBolt.sayName("Bolt"));
        Assertions.assertEquals("hi Rest!", personReferenceRest.sayName("Rest"));
    }
}