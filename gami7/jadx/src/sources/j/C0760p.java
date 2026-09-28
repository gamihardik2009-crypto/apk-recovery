package j;

import java.util.Arrays;
import n2.AbstractC0959k;

/* renamed from: j.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0760p {

    /* renamed from: a, reason: collision with root package name */
    public int[] f8021a;

    /* renamed from: b, reason: collision with root package name */
    public int f8022b;

    public C0760p(int i2) {
        this.f8021a = i2 == 0 ? AbstractC0755k.f8006a : new int[i2];
    }

    public final void a(int i2) {
        b(this.f8022b + 1);
        int[] iArr = this.f8021a;
        int i3 = this.f8022b;
        iArr[i3] = i2;
        this.f8022b = i3 + 1;
    }

    public final void b(int i2) {
        int[] iArr = this.f8021a;
        if (iArr.length < i2) {
            int[] copyOf = Arrays.copyOf(iArr, Math.max(i2, (iArr.length * 3) / 2));
            z2.h.e(copyOf, "copyOf(this, newSize)");
            this.f8021a = copyOf;
        }
    }

    public final int c(int i2) {
        if (i2 >= 0 && i2 < this.f8022b) {
            return this.f8021a[i2];
        }
        StringBuilder l3 = B1.t.l("Index ", i2, " must be in 0..");
        l3.append(this.f8022b - 1);
        throw new IndexOutOfBoundsException(l3.toString());
    }

    public final void d(int i2) {
        int[] iArr = this.f8021a;
        int i3 = this.f8022b;
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                i4 = -1;
                break;
            } else if (i2 == iArr[i4]) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 >= 0) {
            e(i4);
        }
    }

    public final int e(int i2) {
        int i3;
        if (i2 < 0 || i2 >= (i3 = this.f8022b)) {
            StringBuilder l3 = B1.t.l("Index ", i2, " must be in 0..");
            l3.append(this.f8022b - 1);
            throw new IndexOutOfBoundsException(l3.toString());
        }
        int[] iArr = this.f8021a;
        int i4 = iArr[i2];
        if (i2 != i3 - 1) {
            AbstractC0959k.p(iArr, iArr, i2, i2 + 1, i3);
        }
        this.f8022b--;
        return i4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0760p) {
            C0760p c0760p = (C0760p) obj;
            int i2 = c0760p.f8022b;
            int i3 = this.f8022b;
            if (i2 == i3) {
                int[] iArr = this.f8021a;
                int[] iArr2 = c0760p.f8021a;
                E2.d m02 = B1.C.m0(0, i3);
                int i4 = m02.f1076h;
                int i5 = m02.f1077i;
                if (i4 > i5) {
                    return true;
                }
                while (iArr[i4] == iArr2[i4]) {
                    if (i4 == i5) {
                        return true;
                    }
                    i4++;
                }
                return false;
            }
        }
        return false;
    }

    public final void f(int i2, int i3) {
        if (i2 < 0 || i2 >= this.f8022b) {
            StringBuilder l3 = B1.t.l("set index ", i2, " must be between 0 .. ");
            l3.append(this.f8022b - 1);
            throw new IndexOutOfBoundsException(l3.toString());
        }
        int[] iArr = this.f8021a;
        int i4 = iArr[i2];
        iArr[i2] = i3;
    }

    public final int hashCode() {
        int[] iArr = this.f8021a;
        int i2 = this.f8022b;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += Integer.hashCode(iArr[i4]) * 31;
        }
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.f8021a;
        int i2 = this.f8022b;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                sb.append((CharSequence) "]");
                break;
            }
            int i4 = iArr[i3];
            if (i3 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i3 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(i4);
            i3++;
        }
        String sb2 = sb.toString();
        z2.h.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public /* synthetic */ C0760p() {
        this(16);
    }
}
