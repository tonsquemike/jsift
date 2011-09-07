/*
 * Copyright 2011 Stefan C. Mueller.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.smurn.jsift;

/**
 * Reduces the size of an image by a (approximately) factor of two.
 */
public interface DownScaler {

    /**
     * Reduces the size of an image by (approximately) a factor of two.
     * The exact size of the resulting image is implementation dependent, but it
     * is garanteed that both width and height of the resulting image is
     * smaller than of the given image.
     * @param image Image to downScale.
     * @return Image Downscaled image of about half the size and the same sigma.
     * @throws NullPointerException if {@code image} is {@code null}.
     * @throws IllegalArgumentException if the image is not at least one pixel
     * in width and height.
     */
    Image downScale(Image image);
}
