package com.example.simplechatbackend.service;

import com.example.simplechatbackend.repository.ChatRepository;
import com.example.simplechatbackend.repository.RoomRepository;
import com.example.simplechatbackend.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class RoomService {

    private UserRepository userRepository;

    private RoomRepository roomRepository;

    private ChatRepository chatRepository;
}