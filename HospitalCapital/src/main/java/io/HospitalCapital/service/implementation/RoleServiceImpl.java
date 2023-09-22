package io.HospitalCapital.service.implementation;

import io.HospitalCapital.model.Role;
import io.HospitalCapital.repository.RoleRepository;
import io.HospitalCapital.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {
    private final RoleRepository<Role> roleRoleRepository;

    @Override
    public Role getRoleByUserId(Long id) {
        return roleRoleRepository.getRoleByUserId(id);
    }
}
