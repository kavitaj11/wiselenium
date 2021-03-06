/**
 * Copyright (c) 2013 Andre Ricardo Schaffer
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
 */
package com.github.wiselenium.elements.frame;

import com.github.wiselenium.elements.frame.impl.FrameImpl;

@SuppressWarnings("javadoc")
public class FrameCB extends FrameImpl<FrameCB> {
	
	private FrameCBA frame_cba;
	private FrameCBB frame_cbb;
	
	
	public String getFrameCBATextValue() {
		return this.frame_cba.getTextValue();
	}
	
	public String getFrameCBBTextValue() {
		return this.frame_cbb.getTextValue();
	}
	
	public FrameCB sendKeysToFrameCBAText(CharSequence... keys) {
		this.frame_cba.sendKeysToText(keys);
		return this;
	}
	
	public FrameCB sendKeysToFrameCBBText(CharSequence... keys) {
		this.frame_cbb.sendKeysToText(keys);
		return this;
	}
	
}
