package com.kanboo.www.domain.repository.project;

import com.kanboo.www.domain.entity.project.Compiler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompilerRepository extends JpaRepository<Compiler, Long> {
    List<Compiler> findByProjectPrjctIdx(Long prjtcIdx);
    Compiler findByProjectPrjctIdxAndComNm(Long prjtcIdx, String comNm);
}
