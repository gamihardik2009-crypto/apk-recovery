package N;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class k extends a {

    /* renamed from: j, reason: collision with root package name */
    public int f4973j;

    /* renamed from: k, reason: collision with root package name */
    public Object[] f4974k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4975l;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public k(Object[] objArr, int i2, int i3, int i4) {
        super(i2, i3);
        this.f4973j = i4;
        Object[] objArr2 = new Object[i4];
        this.f4974k = objArr2;
        ?? r5 = i2 == i3 ? 1 : 0;
        this.f4975l = r5;
        objArr2[0] = objArr;
        b(i2 - r5, 1);
    }

    public final Object a() {
        int i2 = this.f4946h & 31;
        Object obj = this.f4974k[this.f4973j - 1];
        z2.h.d(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[]) obj)[i2];
    }

    public final void b(int i2, int i3) {
        int i4 = (this.f4973j - i3) * 5;
        while (i3 < this.f4973j) {
            Object[] objArr = this.f4974k;
            Object obj = objArr[i3 - 1];
            z2.h.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i3] = ((Object[]) obj)[l0.c.E(i2, i4)];
            i4 -= 5;
            i3++;
        }
    }

    public final void e(int i2) {
        int i3 = 0;
        while (l0.c.E(this.f4946h, i3) == i2) {
            i3 += 5;
        }
        if (i3 > 0) {
            b(this.f4946h, ((this.f4973j - 1) - (i3 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object a3 = a();
        int i2 = this.f4946h + 1;
        this.f4946h = i2;
        if (i2 == this.f4947i) {
            this.f4975l = true;
            return a3;
        }
        e(0);
        return a3;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f4946h--;
        if (this.f4975l) {
            this.f4975l = false;
            return a();
        }
        e(31);
        return a();
    }
}
