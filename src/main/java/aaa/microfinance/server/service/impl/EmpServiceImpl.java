package aaa.microfinance.server.service.impl;

import aaa.microfinance.server.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpService empService;


}
