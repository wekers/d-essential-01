package com.devsuperior.desafioessential01.entities;

public class Order {

    // argumentos
    private Integer code;
    private Double basic;
    private Double discount;

    /* construtor padrão */
    public Order(){

    }

    /* construtor com argumentos */
    public Order(Integer code, Double basic, Double discount) {
        this.code = code;
        this.basic = basic;
        this.discount = discount;
    }

    /* Getters e Setters */
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Double getBasic() {
        return basic;
    }

    public void setBasic(Double basic) {
        this.basic = basic;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }
}



