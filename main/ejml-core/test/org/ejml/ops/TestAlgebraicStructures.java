/*
 * Copyright (c) 2009-2020, Peter Abeles. All Rights Reserved.
 *
 * This file is part of Efficient Java Matrix Library (EJML).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.ejml.ops;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAlgebraicStructures {

    @Test
    void preDefinedMonoids() {
        assertEquals(0, DMonoids.AND.func.apply(20, 0));
        assertEquals(0, DMonoids.AND.func.apply(0, 20));
        assertEquals(0, DMonoids.AND.func.apply(0, 0));
        assertEquals(1, DMonoids.AND.func.apply(43, 20));

        assertEquals(1, DMonoids.OR.func.apply(43, 20));
        assertEquals(1, DMonoids.OR.func.apply(0, 20));
        assertEquals(1, DMonoids.OR.func.apply(43, 0));
        assertEquals(0, DMonoids.OR.func.apply(0, 0));

        assertEquals(0, DMonoids.XOR.func.apply(43, 20));
        assertEquals(1, DMonoids.XOR.func.apply(0, 20));
        assertEquals(1, DMonoids.XOR.func.apply(43, 0));
        assertEquals(0, DMonoids.XOR.func.apply(0, 0));

        assertEquals(1, DMonoids.XNOR.func.apply(43, 20));
        assertEquals(0, DMonoids.XNOR.func.apply(0, 20));
        assertEquals(0, DMonoids.XNOR.func.apply(43, 0));
        assertEquals(1, DMonoids.XNOR.func.apply(0, 0));

        assertEquals(43, DMonoids.MAX.func.apply(43, 20));
        assertEquals(20, DMonoids.MIN.func.apply(43, 20));


        assertEquals(63, DMonoids.PLUS.func.apply(43, 20));
        assertEquals(860, DMonoids.TIMES.func.apply(43, 20));
    }
}