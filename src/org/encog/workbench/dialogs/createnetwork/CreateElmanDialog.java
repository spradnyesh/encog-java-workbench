/*
 * Encog Workbench v2.x
 * http://www.heatonresearch.com/encog/
 * http://code.google.com/p/encog-java/
 * 
 * Copyright 2008-2009, Heaton Research Inc., and individual contributors.
 * See the copyright.txt in the distribution for a full listing of 
 * individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.encog.workbench.dialogs.createnetwork;

import java.awt.Frame;

import org.encog.workbench.dialogs.common.EncogPropertiesDialog;
import org.encog.workbench.dialogs.common.IntegerField;
import org.encog.workbench.dialogs.common.PropertiesField;
import org.encog.workbench.dialogs.common.PropertyType;

public class CreateElmanDialog extends EncogPropertiesDialog {

	private IntegerField inputCount;
	private IntegerField hiddenCount;
	private IntegerField outputCount;
	
	public CreateElmanDialog(Frame owner) {
		super(owner);
		setTitle("Create Elman Network");
		setSize(400,400);
		setLocation(200,200);
		addProperty(this.inputCount = new IntegerField("input neurons","Input Neuron Count",true,1,-1));
		addProperty(this.hiddenCount = new IntegerField("input neurons","Hidden Neuron Count",true,1,-1));
		addProperty(this.outputCount = new IntegerField("input neurons","Output Neuron Count",true,1,-1));
		render();
	}

	public IntegerField getInputCount() {
		return inputCount;
	}

	public IntegerField getHiddenCount() {
		return hiddenCount;
	}

	public IntegerField getOutputCount() {
		return outputCount;
	}
	
	

}
