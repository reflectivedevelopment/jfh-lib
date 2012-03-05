/*
 * Copyright (C) 2012 by Kim Ebert
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 * 
 */

package com.reflectivedevelopment.jfh.ged.objects.head;

import com.reflectivedevelopment.jfh.ged.objects.GedObject;

public class GedObjectChar extends GedObject {

	public GedObjectChar(GedObject parent, int depth, String name, String value) {
		super(parent, depth, name, value);
	}

	public String getEncoding() {
		if (this.getValue().equals("UTF-8"))
			return "UTF-8";
		if (this.getValue().equals("MACINTOSH"))
			return "x-MacRoman";
		if (this.getValue().equals("ASCII"))
			return "US-ASCII";
		if (this.getValue().equals("ANSI"))
			return "US-ASCII";
		
		return this.getValue();
	}

}
