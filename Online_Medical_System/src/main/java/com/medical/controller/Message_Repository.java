package com.medical.controller;

import java.util.List;

import com.medical.model.Message;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Message_Repository extends JpaRepository<Message , Integer>
{
    List<Message> findByPid(int pid);
}
