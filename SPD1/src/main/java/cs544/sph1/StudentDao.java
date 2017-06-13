/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cs544.sph1;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Ayu
 */
public interface StudentDao extends JpaRepository<Student, Long>{}
