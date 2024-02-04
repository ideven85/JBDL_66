package com.cleo.JBDL.collections;

import lombok.Builder;

public class Movie {

    private Long id;

    private String name;

    private double rating;

    private static class Builder{

        private Long id;
        private String name;
        private double rating;

        public Builder id(Long id){
            this.id=id;
            return this;
        }
        public Builder name(String name){
            this.name=name;
            return this;
        }
        public Builder rating(double rating){
            this.rating=rating;
            return this;
        }
        public Movie build(){
            return new Movie(this);
        }


    }

    public Movie(Builder builder){
        this.id=builder.id;
        this.name= builder.name;
        this.rating= builder.rating;

    }

    public static void main(String[] args) {
        Movie movie =new Movie.Builder().id(1L).name("MIB").rating(2).build();
    }
}
