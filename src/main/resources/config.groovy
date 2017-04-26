package spring.ch4.try_groovy

import org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader
import org.springframework.context.support.GenericApplicationContext

def context = new GenericApplicationContext()
def reader = new GroovyBeanDefinitionReader()

reader.beans{
    contact(Contact, first_name: 'Chris', surname: 'Evans')
}
context.refresh()

println context.getBean('contact')


