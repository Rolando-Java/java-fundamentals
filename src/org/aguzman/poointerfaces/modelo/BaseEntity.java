package org.aguzman.poointerfaces.modelo;

import java.util.Objects;

public class BaseEntity {

    private Integer id;
    private static int ultimoId;

    public BaseEntity(){
        this.id = ++BaseEntity.ultimoId;
    }

    public Integer getId(){
        return this.id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    @Override
    public boolean equals(Object object){
        if(this == object) return true;
        if(object == null || !(object instanceof BaseEntity)) return false;
        BaseEntity baseEntity = (BaseEntity) object;
        return (Objects.equals(this.getId(), baseEntity.getId()));
    }

    @Override
    public int hashCode(){
        return Objects.hashCode(this.getId());
    }

    @Override
    public String toString(){
        return "Id: " + this.getId();
    }

}
