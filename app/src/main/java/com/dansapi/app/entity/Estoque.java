package com.dansapi.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_estoque", schema = "public")
public class Estoque extends AbstractEntity{
}
