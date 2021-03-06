/**
 * The MIT License
 * Copyright (c) 2013 Teal Cube Games
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
package com.tealcube.minecraft.bukkit.mythicdrops.identification;

import com.tealcube.minecraft.bukkit.mythicdrops.api.events.MythicDropsCancellableEvent;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public final class IdentificationEvent extends MythicDropsCancellableEvent {

    private final Player identifier;
    private ItemStack result;

    public IdentificationEvent(ItemStack result, Player identifier) {
        this.result = result;
        this.identifier = identifier;
    }

    public ItemStack getResult() {
        return result;
    }

    public void setResult(ItemStack result) {
        this.result = result;
    }

    public Player getIdentifier() {
        return identifier;
    }

}
