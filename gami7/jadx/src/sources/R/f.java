package R;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f5377a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f5378b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f5379c;

    public f(int i2, long[] jArr, Object[] objArr) {
        this.f5377a = i2;
        this.f5378b = jArr;
        this.f5379c = objArr;
    }

    public final int a(long j3) {
        int i2 = this.f5377a - 1;
        if (i2 == -1) {
            return -1;
        }
        long[] jArr = this.f5378b;
        int i3 = 0;
        if (i2 == 0) {
            long j4 = jArr[0];
            if (j4 == j3) {
                return 0;
            }
            return j4 > j3 ? -2 : -1;
        }
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j5 = jArr[i4] - j3;
            if (j5 < 0) {
                i3 = i4 + 1;
            } else {
                if (j5 <= 0) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public final f b(long j3, Object obj) {
        long[] jArr;
        int i2;
        Object[] objArr = this.f5379c;
        int i3 = 0;
        int i4 = 0;
        for (Object obj2 : objArr) {
            if (obj2 != null) {
                i4++;
            }
        }
        int i5 = i4 + 1;
        long[] jArr2 = new long[i5];
        Object[] objArr2 = new Object[i5];
        if (i5 > 1) {
            int i6 = 0;
            while (true) {
                jArr = this.f5378b;
                i2 = this.f5377a;
                if (i3 >= i5 || i6 >= i2) {
                    break;
                }
                long j4 = jArr[i6];
                Object obj3 = objArr[i6];
                if (j4 > j3) {
                    jArr2[i3] = j3;
                    objArr2[i3] = obj;
                    i3++;
                    break;
                }
                if (obj3 != null) {
                    jArr2[i3] = j4;
                    objArr2[i3] = obj3;
                    i3++;
                }
                i6++;
            }
            if (i6 == i2) {
                jArr2[i4] = j3;
                objArr2[i4] = obj;
            } else {
                while (i3 < i5) {
                    long j5 = jArr[i6];
                    Object obj4 = objArr[i6];
                    if (obj4 != null) {
                        jArr2[i3] = j5;
                        objArr2[i3] = obj4;
                        i3++;
                    }
                    i6++;
                }
            }
        } else {
            jArr2[0] = j3;
            objArr2[0] = obj;
        }
        return new f(i5, jArr2, objArr2);
    }
}
