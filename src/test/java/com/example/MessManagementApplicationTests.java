package com.example;

import com.example.dao.InstructionRepository;
import com.example.dao.MesstimeRepository;
import com.example.model.Instruction;
import com.example.model.Messtime;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@SpringBootTest
class MessManagementApplicationTests {

	@Autowired
	private MesstimeRepository messtimeRepository;

	@Test
	void contextLoads() {
	}
	@Test
	void findById1() {
		Messtime res=messtimeRepository.findById1(1);
		assertThat(res).isNotNull();
		assertThat(res.getId()).isEqualTo(1);
	}

	@Autowired
	private InstructionRepository instructionRepository;

	@Test
	void findById2() {

		Instruction res=instructionRepository.findById1(1);
		assertThat(res).isNotNull();
		assertThat(res.getId()).isEqualTo(1);
	}
}
