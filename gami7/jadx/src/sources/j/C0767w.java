package j;

import java.util.Arrays;

/* renamed from: j.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0767w {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f8057a = new Object[16];

    /* renamed from: b, reason: collision with root package name */
    public int f8058b;

    public final void a(Object obj) {
        int i2 = this.f8058b + 1;
        Object[] objArr = this.f8057a;
        if (objArr.length < i2) {
            Object[] copyOf = Arrays.copyOf(objArr, Math.max(i2, (objArr.length * 3) / 2));
            z2.h.e(copyOf, "copyOf(this, newSize)");
            this.f8057a = copyOf;
        }
        Object[] objArr2 = this.f8057a;
        int i3 = this.f8058b;
        objArr2[i3] = obj;
        this.f8058b = i3 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0767w) {
            C0767w c0767w = (C0767w) obj;
            int i2 = c0767w.f8058b;
            int i3 = this.f8058b;
            if (i2 == i3) {
                Object[] objArr = this.f8057a;
                Object[] objArr2 = c0767w.f8057a;
                E2.d m02 = B1.C.m0(0, i3);
                int i4 = m02.f1076h;
                int i5 = m02.f1077i;
                if (i4 > i5) {
                    return true;
                }
                while (z2.h.a(objArr[i4], objArr2[i4])) {
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

    public final int hashCode() {
        Object[] objArr = this.f8057a;
        int i2 = this.f8058b;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            i3 += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        Object[] objArr = this.f8057a;
        int i2 = this.f8058b;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                sb.append((CharSequence) "]");
                break;
            }
            Object obj = objArr[i3];
            if (i3 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i3 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) (obj == this ? "(this)" : String.valueOf(obj)));
            i3++;
        }
        String sb2 = sb.toString();
        z2.h.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
