package com.first.spring.componentScan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.first.spring.componentScan")
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ComponentDAO {
    @Autowired
    ComponentJdbcConnection jdbcConnection;

    public ComponentJdbcConnection getComponentJdbcConnection() {
        return jdbcConnection;
    }

    public void setComponentJdbcConnection(ComponentJdbcConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }
}
