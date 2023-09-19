常见的激活函数有以下几种：

1. **Sigmoid函数**（Logistic函数）：
   $$\sigma(x) = \frac{1}{1 + e^{-x}}$$
   Sigmoid函数将输入映射到0到1之间的连续输出，通常用于输出层的二元分类问题。

2. **双曲正切函数**（Tanh函数）：
   $$\tanh(x) = \frac{e^x - e^{-x}}{e^x + e^{-x}}$$
   Tanh函数将输入映射到-1到1之间的连续输出，也被广泛用于神经网络中。

3. **整流线性单元**（Rectified Linear Unit，ReLU）：
   $$ReLU(x) = \max(0, x)$$
   ReLU函数是一种简单而有效的激活函数，它在输入大于零时返回输入值，否则返回零。它在深度学习中非常流行，因为它具有快速收敛的特点。

4. **Leaky ReLU**：
   $$
   LeakyReLU(x) = \begin{cases} x & \text{if } x > 0 \\ \alpha x & \text{if } x \leq 0 \end{cases}
   $$
   Leaky ReLU是ReLU的一种变体，它在输入小于零时返回一个小的负斜率（通常是0.01），以解决ReLU的一些问题。

6. **参数化ReLU**（Parametric ReLU，PReLU）：
   $$PReLU(x) = \begin{cases} x & \text{if } x > 0 \\ a x & \text{if } x \leq 0 \end{cases}$$
   PReLU是一个带有可学习参数的变体，可以让网络学习最适合的斜率。

7. **指数线性单元**（Exponential Linear Unit，ELU）：
   $$ELU(x) = \begin{cases} x & \text{if } x > 0 \\ \alpha(e^x - 1) & \text{if } x \leq 0 \end{cases}$$
   ELU是一种激活函数，它克服了ReLU的一些限制，并在负值范围内引入了一个小的非零斜率。

8. **softmax函数**：
   $$\text{softmax}(x)_i = \frac{e^{x_i}}{\sum_{j=1}^{K} e^{x_j}}$$
   softmax函数通常用于多类别分类问题的输出层，将输入向量转换为概率分布。

这些是一些常见的激活函数，每个都在不同的情况下有其优势和用途。选择合适的激活函数通常取决于你的神经网络架构和问题类型。
