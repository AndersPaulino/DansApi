package com.dansapi.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_tipo",schema = "public")
public class Tipo extends AbstractEntity{
}
