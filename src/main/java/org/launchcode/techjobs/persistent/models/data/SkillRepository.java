package org.launchcode.techjobs.persistent.models.data;

import org.launchcode.techjobs.persistent.models.Skill;

import java.util.Optional;

public interface SkillRepository {
    Optional<Skill> findById(int skillId);

    Object findAll();

    void save(Skill newSkill);
}
