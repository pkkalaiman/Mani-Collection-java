package com.xworkz.mani.ManiEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "mani_table")
public class ManiEntity {

	@Id
	@Column(name = "m_id")
	private int id;
	@Column(name = "m_name")
	private String name;
	@Column(name = "m_brandName")
	private String brandName;
	@Column(name = "m_modelName")
	private String modelName;
	@Column(name = "m_Os")
	private String os;
	@Column(name = "m_storage")
	private int storage;
	@Column(name = "m_technology")
	private String technology;
	@Column(name = "m_color")
	private String colors;

}
