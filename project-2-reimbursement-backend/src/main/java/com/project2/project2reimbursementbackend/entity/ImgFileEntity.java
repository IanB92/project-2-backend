package com.project2.project2reimbursementbackend.entity;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "image_details")
public class ImgFileEntity {

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@Column(name = "img_id")
	private String id;
	@Column(name = "img_name")
	private String name;
	@Column(name = "img_type")
	private String type;
	@Lob
	@Column(name = "img_size")
	private byte[] data;

	public ImgFileEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ImgFileEntity(String name, String type, byte[] data) {
		super();

		this.name = name;
		this.type = type;
		this.data = data;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "ImgFileEntity [id=" + id + ", name=" + name + ", type=" + type + ", data=" + Arrays.toString(data)
				+ "]";
	}

}
