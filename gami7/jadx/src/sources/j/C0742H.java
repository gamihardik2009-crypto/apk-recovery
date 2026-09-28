package j;

import java.util.Arrays;
import k.AbstractC0779a;
import n2.AbstractC0959k;

/* renamed from: j.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0742H implements Cloneable {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ boolean f7976h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ int[] f7977i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object[] f7978j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ int f7979k;

    public C0742H() {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 40;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (40 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.f7977i = new int[i5];
        this.f7978j = new Object[i5];
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0742H clone() {
        Object clone = super.clone();
        z2.h.d(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        C0742H c0742h = (C0742H) clone;
        c0742h.f7977i = (int[]) this.f7977i.clone();
        c0742h.f7978j = (Object[]) this.f7978j.clone();
        return c0742h;
    }

    public final boolean b(int i2) {
        if (this.f7976h) {
            AbstractC0758n.a(this);
        }
        return AbstractC0779a.a(this.f7977i, this.f7979k, i2) >= 0;
    }

    public final Object c(int i2) {
        Object obj;
        int a3 = AbstractC0779a.a(this.f7977i, this.f7979k, i2);
        if (a3 < 0 || (obj = this.f7978j[a3]) == AbstractC0758n.f8014c) {
            return null;
        }
        return obj;
    }

    public final int d(int i2) {
        if (this.f7976h) {
            AbstractC0758n.a(this);
        }
        return this.f7977i[i2];
    }

    public final void e(int i2, Object obj) {
        int a3 = AbstractC0779a.a(this.f7977i, this.f7979k, i2);
        if (a3 >= 0) {
            this.f7978j[a3] = obj;
            return;
        }
        int i3 = ~a3;
        int i4 = this.f7979k;
        if (i3 < i4) {
            Object[] objArr = this.f7978j;
            if (objArr[i3] == AbstractC0758n.f8014c) {
                this.f7977i[i3] = i2;
                objArr[i3] = obj;
                return;
            }
        }
        if (this.f7976h && i4 >= this.f7977i.length) {
            AbstractC0758n.a(this);
            i3 = ~AbstractC0779a.a(this.f7977i, this.f7979k, i2);
        }
        int i5 = this.f7979k;
        if (i5 >= this.f7977i.length) {
            int i6 = (i5 + 1) * 4;
            int i7 = 4;
            while (true) {
                if (i7 >= 32) {
                    break;
                }
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
                i7++;
            }
            int i9 = i6 / 4;
            int[] copyOf = Arrays.copyOf(this.f7977i, i9);
            z2.h.e(copyOf, "copyOf(this, newSize)");
            this.f7977i = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f7978j, i9);
            z2.h.e(copyOf2, "copyOf(this, newSize)");
            this.f7978j = copyOf2;
        }
        int i10 = this.f7979k;
        if (i10 - i3 != 0) {
            int[] iArr = this.f7977i;
            int i11 = i3 + 1;
            AbstractC0959k.p(iArr, iArr, i11, i3, i10);
            Object[] objArr2 = this.f7978j;
            AbstractC0959k.q(objArr2, objArr2, i11, i3, this.f7979k);
        }
        this.f7977i[i3] = i2;
        this.f7978j[i3] = obj;
        this.f7979k++;
    }

    public final int f() {
        if (this.f7976h) {
            AbstractC0758n.a(this);
        }
        return this.f7979k;
    }

    public final Object g(int i2) {
        if (this.f7976h) {
            AbstractC0758n.a(this);
        }
        return this.f7978j[i2];
    }

    public final String toString() {
        if (f() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f7979k * 28);
        sb.append('{');
        int i2 = this.f7979k;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(d(i3));
            sb.append('=');
            Object g3 = g(i3);
            if (g3 != this) {
                sb.append(g3);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        z2.h.e(sb2, "buffer.toString()");
        return sb2;
    }
}
