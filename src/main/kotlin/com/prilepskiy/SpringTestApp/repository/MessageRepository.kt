package com.prilepskiy.SpringTestApp.repository

import com.prilepskiy.SpringTestApp.model.Message
import org.springframework.data.repository.CrudRepository

interface MessageRepository : CrudRepository<Message, String>
