package com.dbcoder.dto;


import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

public class PersonDto implements TestInterfaceVO{
    @NotNull(message="不能为空")
    private String name;
    private Integer age;
    private List<TestDto> testDtos;
    private Integer testAge;
    private BigDecimal amount;

    @Override
    public String toString(){
        return "{"+this.name+" "+this.age+"}";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<TestDto> getTestDtos() {
        return testDtos;
    }

    public void setTestDtos(List<TestDto> testDtos) {
        this.testDtos = testDtos;
    }

    public Integer getTestAge() {
        return testAge;
    }

    public void setTestAge(Integer testAge) {
        this.testAge = testAge;
    }

    @Override
    public String testStr() {
        return null;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
