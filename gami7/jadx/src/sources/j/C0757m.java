package j;

import java.util.Arrays;
import k.AbstractC0779a;
import n2.AbstractC0959k;

/* renamed from: j.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0757m implements Cloneable {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ boolean f8008h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ long[] f8009i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object[] f8010j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ int f8011k;

    public C0757m(int i2) {
        if (i2 == 0) {
            this.f8009i = AbstractC0779a.f8102b;
            this.f8010j = AbstractC0779a.f8103c;
            return;
        }
        int i3 = i2 * 8;
        int i4 = 4;
        while (true) {
            if (i4 >= 32) {
                break;
            }
            int i5 = (1 << i4) - 12;
            if (i3 <= i5) {
                i3 = i5;
                break;
            }
            i4++;
        }
        int i6 = i3 / 8;
        this.f8009i = new long[i6];
        this.f8010j = new Object[i6];
    }

    public final long a(int i2) {
        int i3;
        if (i2 < 0 || i2 >= (i3 = this.f8011k)) {
            throw new IllegalArgumentException(B1.t.h("Expected index to be within 0..size()-1, but was ", i2).toString());
        }
        if (this.f8008h) {
            long[] jArr = this.f8009i;
            Object[] objArr = this.f8010j;
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                Object obj = objArr[i5];
                if (obj != AbstractC0758n.f8012a) {
                    if (i5 != i4) {
                        jArr[i4] = jArr[i5];
                        objArr[i4] = obj;
                        objArr[i5] = null;
                    }
                    i4++;
                }
            }
            this.f8008h = false;
            this.f8011k = i4;
        }
        return this.f8009i[i2];
    }

    public final void b(long j3, Object obj) {
        int b3 = AbstractC0779a.b(this.f8009i, this.f8011k, j3);
        if (b3 >= 0) {
            this.f8010j[b3] = obj;
            return;
        }
        int i2 = ~b3;
        int i3 = this.f8011k;
        Object obj2 = AbstractC0758n.f8012a;
        if (i2 < i3) {
            Object[] objArr = this.f8010j;
            if (objArr[i2] == obj2) {
                this.f8009i[i2] = j3;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.f8008h) {
            long[] jArr = this.f8009i;
            if (i3 >= jArr.length) {
                Object[] objArr2 = this.f8010j;
                int i4 = 0;
                for (int i5 = 0; i5 < i3; i5++) {
                    Object obj3 = objArr2[i5];
                    if (obj3 != obj2) {
                        if (i5 != i4) {
                            jArr[i4] = jArr[i5];
                            objArr2[i4] = obj3;
                            objArr2[i5] = null;
                        }
                        i4++;
                    }
                }
                this.f8008h = false;
                this.f8011k = i4;
                i2 = ~AbstractC0779a.b(this.f8009i, i4, j3);
            }
        }
        int i6 = this.f8011k;
        if (i6 >= this.f8009i.length) {
            int i7 = (i6 + 1) * 8;
            int i8 = 4;
            while (true) {
                if (i8 >= 32) {
                    break;
                }
                int i9 = (1 << i8) - 12;
                if (i7 <= i9) {
                    i7 = i9;
                    break;
                }
                i8++;
            }
            int i10 = i7 / 8;
            long[] copyOf = Arrays.copyOf(this.f8009i, i10);
            z2.h.e(copyOf, "copyOf(this, newSize)");
            this.f8009i = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f8010j, i10);
            z2.h.e(copyOf2, "copyOf(this, newSize)");
            this.f8010j = copyOf2;
        }
        int i11 = this.f8011k - i2;
        if (i11 != 0) {
            long[] jArr2 = this.f8009i;
            int i12 = i2 + 1;
            z2.h.f(jArr2, "<this>");
            System.arraycopy(jArr2, i2, jArr2, i12, i11);
            Object[] objArr3 = this.f8010j;
            AbstractC0959k.q(objArr3, objArr3, i12, i2, this.f8011k);
        }
        this.f8009i[i2] = j3;
        this.f8010j[i2] = obj;
        this.f8011k++;
    }

    public final int c() {
        if (this.f8008h) {
            int i2 = this.f8011k;
            long[] jArr = this.f8009i;
            Object[] objArr = this.f8010j;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != AbstractC0758n.f8012a) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f8008h = false;
            this.f8011k = i3;
        }
        return this.f8011k;
    }

    public final Object clone() {
        Object clone = super.clone();
        z2.h.d(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        C0757m c0757m = (C0757m) clone;
        c0757m.f8009i = (long[]) this.f8009i.clone();
        c0757m.f8010j = (Object[]) this.f8010j.clone();
        return c0757m;
    }

    public final Object d(int i2) {
        int i3;
        if (i2 < 0 || i2 >= (i3 = this.f8011k)) {
            throw new IllegalArgumentException(B1.t.h("Expected index to be within 0..size()-1, but was ", i2).toString());
        }
        if (this.f8008h) {
            long[] jArr = this.f8009i;
            Object[] objArr = this.f8010j;
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                Object obj = objArr[i5];
                if (obj != AbstractC0758n.f8012a) {
                    if (i5 != i4) {
                        jArr[i4] = jArr[i5];
                        objArr[i4] = obj;
                        objArr[i5] = null;
                    }
                    i4++;
                }
            }
            this.f8008h = false;
            this.f8011k = i4;
        }
        return this.f8010j[i2];
    }

    public final String toString() {
        if (c() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f8011k * 28);
        sb.append('{');
        int i2 = this.f8011k;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(a(i3));
            sb.append('=');
            Object d3 = d(i3);
            if (d3 != sb) {
                sb.append(d3);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        z2.h.e(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
