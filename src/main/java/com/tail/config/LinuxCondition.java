package com.tail.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class LinuxCondition implements Condition {
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {

        String osName = conditionContext.getEnvironment().getProperty("os.name");

        if (osName.contains("Linux")){
            return true;
        }

        return false;
    }
}
