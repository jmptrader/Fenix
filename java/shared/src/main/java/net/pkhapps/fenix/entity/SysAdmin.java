/*
 * Fenix
 * Copyright (C) 2014 Petter Holmström
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package net.pkhapps.fenix.entity;

import java.util.Collection;
import java.util.Collections;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import org.springframework.security.core.GrantedAuthority;

/**
 * Entity class for system users that are system administrators.
 *
 * @author Petter Holmström
 */
@Entity
@DiscriminatorValue("ADMIN")
public class SysAdmin extends User {

    public static final GrantedAuthority ROLE = () -> "ROLE_SYSADMIN";

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singleton(ROLE);
    }
}
