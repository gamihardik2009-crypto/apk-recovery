package T;

import a.AbstractC0423a;
import java.util.ArrayList;
import java.util.Iterator;
import n2.AbstractC0959k;
import n2.AbstractC0961m;
import n2.AbstractC0964p;

/* loaded from: classes.dex */
public final class l implements Iterable, A2.a {

    /* renamed from: l, reason: collision with root package name */
    public static final l f5701l = new l(0, 0, 0, null);

    /* renamed from: h, reason: collision with root package name */
    public final long f5702h;

    /* renamed from: i, reason: collision with root package name */
    public final long f5703i;

    /* renamed from: j, reason: collision with root package name */
    public final int f5704j;

    /* renamed from: k, reason: collision with root package name */
    public final int[] f5705k;

    public l(long j3, long j4, int i2, int[] iArr) {
        this.f5702h = j3;
        this.f5703i = j4;
        this.f5704j = i2;
        this.f5705k = iArr;
    }

    public final l a(l lVar) {
        l lVar2;
        int[] iArr;
        l lVar3 = f5701l;
        if (lVar == lVar3) {
            return this;
        }
        if (this == lVar3) {
            return lVar3;
        }
        int i2 = lVar.f5704j;
        int[] iArr2 = lVar.f5705k;
        long j3 = lVar.f5703i;
        long j4 = lVar.f5702h;
        int i3 = this.f5704j;
        if (i2 == i3 && iArr2 == (iArr = this.f5705k)) {
            return new l(this.f5702h & (~j4), this.f5703i & (~j3), i3, iArr);
        }
        if (iArr2 != null) {
            lVar2 = this;
            for (int i4 : iArr2) {
                lVar2 = lVar2.b(i4);
            }
        } else {
            lVar2 = this;
        }
        int i5 = lVar.f5704j;
        if (j3 != 0) {
            for (int i6 = 0; i6 < 64; i6++) {
                if (((1 << i6) & j3) != 0) {
                    lVar2 = lVar2.b(i6 + i5);
                }
            }
        }
        if (j4 != 0) {
            for (int i7 = 0; i7 < 64; i7++) {
                if (((1 << i7) & j4) != 0) {
                    lVar2 = lVar2.b(i7 + 64 + i5);
                }
            }
        }
        return lVar2;
    }

    public final l b(int i2) {
        int[] iArr;
        int b3;
        int i3 = this.f5704j;
        int i4 = i2 - i3;
        if (i4 >= 0 && i4 < 64) {
            long j3 = 1 << i4;
            long j4 = this.f5703i;
            if ((j4 & j3) != 0) {
                return new l(this.f5702h, j4 & (~j3), i3, this.f5705k);
            }
        } else if (i4 >= 64 && i4 < 128) {
            long j5 = 1 << (i4 - 64);
            long j6 = this.f5702h;
            if ((j6 & j5) != 0) {
                return new l(j6 & (~j5), this.f5703i, i3, this.f5705k);
            }
        } else if (i4 < 0 && (iArr = this.f5705k) != null && (b3 = s.b(iArr, i2)) >= 0) {
            int length = iArr.length;
            int i5 = length - 1;
            if (i5 == 0) {
                return new l(this.f5702h, this.f5703i, this.f5704j, null);
            }
            int[] iArr2 = new int[i5];
            if (b3 > 0) {
                AbstractC0959k.p(iArr, iArr2, 0, 0, b3);
            }
            if (b3 < i5) {
                AbstractC0959k.p(iArr, iArr2, b3, b3 + 1, length);
            }
            return new l(this.f5702h, this.f5703i, this.f5704j, iArr2);
        }
        return this;
    }

    public final boolean e(int i2) {
        int[] iArr;
        int i3 = i2 - this.f5704j;
        if (i3 >= 0 && i3 < 64) {
            return ((1 << i3) & this.f5703i) != 0;
        }
        if (i3 >= 64 && i3 < 128) {
            return ((1 << (i3 - 64)) & this.f5702h) != 0;
        }
        if (i3 <= 0 && (iArr = this.f5705k) != null) {
            return s.b(iArr, i2) >= 0;
        }
        return false;
    }

    public final l f(l lVar) {
        l lVar2;
        int[] iArr;
        l lVar3 = lVar;
        l lVar4 = f5701l;
        if (lVar3 == lVar4) {
            return this;
        }
        if (this == lVar4) {
            return lVar3;
        }
        int i2 = lVar3.f5704j;
        long j3 = this.f5703i;
        long j4 = this.f5702h;
        int[] iArr2 = lVar3.f5705k;
        long j5 = lVar3.f5703i;
        long j6 = lVar3.f5702h;
        int i3 = this.f5704j;
        if (i2 == i3 && iArr2 == (iArr = this.f5705k)) {
            return new l(j4 | j6, j3 | j5, i3, iArr);
        }
        int[] iArr3 = this.f5705k;
        if (iArr3 == null) {
            if (iArr3 != null) {
                for (int i4 : iArr3) {
                    lVar3 = lVar3.g(i4);
                }
            }
            int i5 = this.f5704j;
            if (j3 != 0) {
                for (int i6 = 0; i6 < 64; i6++) {
                    if (((1 << i6) & j3) != 0) {
                        lVar3 = lVar3.g(i6 + i5);
                    }
                }
            }
            if (j4 == 0) {
                return lVar3;
            }
            for (int i7 = 0; i7 < 64; i7++) {
                if (((1 << i7) & j4) != 0) {
                    lVar3 = lVar3.g(i7 + 64 + i5);
                }
            }
            return lVar3;
        }
        if (iArr2 != null) {
            lVar2 = this;
            for (int i8 : iArr2) {
                lVar2 = lVar2.g(i8);
            }
        } else {
            lVar2 = this;
        }
        int i9 = lVar3.f5704j;
        if (j5 != 0) {
            for (int i10 = 0; i10 < 64; i10++) {
                if (((1 << i10) & j5) != 0) {
                    lVar2 = lVar2.g(i10 + i9);
                }
            }
        }
        if (j6 != 0) {
            for (int i11 = 0; i11 < 64; i11++) {
                if (((1 << i11) & j6) != 0) {
                    lVar2 = lVar2.g(i11 + 64 + i9);
                }
            }
        }
        return lVar2;
    }

    public final l g(int i2) {
        long j3;
        int i3;
        int i4 = this.f5704j;
        int i5 = i2 - i4;
        long j4 = this.f5703i;
        if (i5 < 0 || i5 >= 64) {
            long j5 = this.f5702h;
            if (i5 < 64 || i5 >= 128) {
                int[] iArr = this.f5705k;
                if (i5 < 128) {
                    if (iArr == null) {
                        return new l(j5, j4, i4, new int[]{i2});
                    }
                    int b3 = s.b(iArr, i2);
                    if (b3 < 0) {
                        int i6 = -(b3 + 1);
                        int length = iArr.length;
                        int[] iArr2 = new int[length + 1];
                        AbstractC0959k.p(iArr, iArr2, 0, 0, i6);
                        AbstractC0959k.p(iArr, iArr2, i6 + 1, i6, length);
                        iArr2[i6] = i2;
                        return new l(this.f5702h, this.f5703i, this.f5704j, iArr2);
                    }
                } else if (!e(i2)) {
                    int i7 = ((i2 + 1) / 64) * 64;
                    int i8 = this.f5704j;
                    ArrayList arrayList = null;
                    long j6 = j5;
                    while (true) {
                        if (i8 >= i7) {
                            j3 = j4;
                            i3 = i8;
                            break;
                        }
                        if (j4 != 0) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                if (iArr != null) {
                                    for (int i9 : iArr) {
                                        arrayList.add(Integer.valueOf(i9));
                                    }
                                }
                            }
                            for (int i10 = 0; i10 < 64; i10++) {
                                if (((1 << i10) & j4) != 0) {
                                    arrayList.add(Integer.valueOf(i10 + i8));
                                }
                            }
                        }
                        if (j6 == 0) {
                            i3 = i7;
                            j3 = 0;
                            break;
                        }
                        i8 += 64;
                        j4 = j6;
                        j6 = 0;
                    }
                    if (arrayList != null) {
                        iArr = AbstractC0961m.W(arrayList);
                    }
                    return new l(j6, j3, i3, iArr).g(i2);
                }
            } else {
                long j7 = 1 << (i5 - 64);
                if ((j5 & j7) == 0) {
                    return new l(j5 | j7, j4, i4, this.f5705k);
                }
            }
        } else {
            long j8 = 1 << i5;
            if ((j4 & j8) == 0) {
                return new l(this.f5702h, j4 | j8, i4, this.f5705k);
            }
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return AbstractC0423a.Q(new k(this, null));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(AbstractC0964p.z(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = arrayList.get(i3);
            i2++;
            if (i2 > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj == null || (obj instanceof CharSequence)) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) String.valueOf(obj));
            }
        }
        sb2.append((CharSequence) "");
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }
}
