package com.spring.boardweb.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class BoardFileId implements Serializable{
	private int board; //int값과 BoardFile.java의 변수명을 동일하게 작성해야함 
	private int fileSeq;
}
