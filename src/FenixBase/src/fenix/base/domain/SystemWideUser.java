/*
 * Fenix
 * Copyright (C) 2012 Petter Holmström
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
package fenix.base.domain;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 * SystemWideUsers are administrators of the system and are not associated with
 * any specific organization.
 * 
 * @see SystemWideUserRole
 * 
 * @author Petter Holmström
 */
@Entity
@DiscriminatorValue("SystemWide")
public class SystemWideUser extends User {

	private static final long serialVersionUID = 7377215085819278673L;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	protected SystemWideUserRole role;

	public SystemWideUserRole getRole() {
		return role;
	}

	public void setRole(SystemWideUserRole role) {
		this.role = role;
	}
}