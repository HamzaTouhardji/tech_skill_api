package com.hamza.tech_skills;

import org.graalvm.polyglot.Value;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.graalvm.polyglot.Context;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
@SpringBootTest
class TechSkillsApplicationTests {

	@Test
	void contextLoads() {

		Context context = Context.create("");
		Value js = context.eval("js", "console.log(toot)");

	}

}
