package g1;

import B1.C;
import h1.C0697a;
import java.nio.ByteBuffer;
import java.util.Arrays;
import m.AbstractC0837j;
import n2.AbstractC0946A;
import n2.AbstractC0962n;
import o0.C0991a;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7736a;

    /* renamed from: b, reason: collision with root package name */
    public int f7737b;

    /* renamed from: c, reason: collision with root package name */
    public int f7738c;

    /* renamed from: d, reason: collision with root package name */
    public int f7739d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f7740e;

    /* renamed from: f, reason: collision with root package name */
    public Object f7741f;

    /* renamed from: g, reason: collision with root package name */
    public Object f7742g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f7743h;

    public p() {
        int i2;
        this.f7736a = false;
        this.f7737b = 1;
        int d3 = AbstractC0837j.d(1);
        if (d3 == 0) {
            i2 = 3;
        } else {
            if (d3 != 1) {
                throw new J2.r();
            }
            i2 = 2;
        }
        this.f7738c = i2;
        this.f7740e = new C0991a[20];
        this.f7741f = new float[20];
        this.f7742g = new float[20];
        this.f7743h = new float[3];
    }

    public void a(float f3, long j3) {
        int i2 = (this.f7739d + 1) % 20;
        this.f7739d = i2;
        C0991a[] c0991aArr = (C0991a[]) this.f7740e;
        C0991a c0991a = c0991aArr[i2];
        if (c0991a != null) {
            c0991a.f9226a = j3;
            c0991a.f9227b = f3;
        } else {
            C0991a c0991a2 = new C0991a();
            c0991a2.f9226a = j3;
            c0991a2.f9227b = f3;
            c0991aArr[i2] = c0991a2;
        }
    }

    public float b(float f3) {
        int i2;
        float[] fArr;
        float[] fArr2;
        boolean z3;
        float f4;
        float f5;
        float f6 = 0.0f;
        if (f3 <= 0.0f) {
            AbstractC0946A.r("maximumVelocity should be a positive value. You specified=" + f3);
            throw null;
        }
        int i3 = this.f7739d;
        C0991a[] c0991aArr = (C0991a[]) this.f7740e;
        C0991a c0991a = c0991aArr[i3];
        if (c0991a == null) {
            f4 = 0.0f;
        } else {
            int i4 = 0;
            C0991a c0991a2 = c0991a;
            while (true) {
                C0991a c0991a3 = c0991aArr[i3];
                boolean z4 = this.f7736a;
                i2 = this.f7737b;
                fArr = (float[]) this.f7741f;
                fArr2 = (float[]) this.f7742g;
                if (c0991a3 != null) {
                    long j3 = c0991a.f9226a;
                    int i5 = i3;
                    long j4 = c0991a3.f9226a;
                    float f7 = j3 - j4;
                    z3 = z4;
                    float abs = Math.abs(j4 - c0991a2.f9226a);
                    c0991a2 = (i2 == 1 || z3) ? c0991a3 : c0991a;
                    if (f7 > 100.0f || abs > 40.0f) {
                        break;
                    }
                    fArr[i4] = c0991a3.f9227b;
                    fArr2[i4] = -f7;
                    i3 = (i5 == 0 ? 20 : i5) - 1;
                    i4++;
                    if (i4 >= 20) {
                        break;
                    }
                } else {
                    z3 = z4;
                    break;
                }
            }
            if (i4 >= this.f7738c) {
                int d3 = AbstractC0837j.d(i2);
                if (d3 == 0) {
                    try {
                        float[] fArr3 = (float[]) this.f7743h;
                        AbstractC0962n.n(fArr2, fArr, i4, fArr3);
                        f5 = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        f5 = 0.0f;
                    }
                } else {
                    if (d3 != 1) {
                        throw new J2.r();
                    }
                    int i6 = i4 - 1;
                    float f8 = fArr2[i6];
                    int i7 = i6;
                    float f9 = 0.0f;
                    while (i7 > 0) {
                        int i8 = i7 - 1;
                        float f10 = fArr2[i8];
                        if (f8 != f10) {
                            float f11 = (z3 ? -fArr[i8] : fArr[i7] - fArr[i8]) / (f8 - f10);
                            f9 += Math.abs(f11) * (f11 - (Math.signum(f9) * ((float) Math.sqrt(Math.abs(f9) * 2))));
                            if (i7 == i6) {
                                f9 *= 0.5f;
                            }
                        }
                        i7--;
                        f8 = f10;
                    }
                    f5 = Math.signum(f9) * ((float) Math.sqrt(Math.abs(f9) * 2));
                }
                f6 = f5 * 1000;
            } else {
                f6 = 0.0f;
            }
            f4 = 0.0f;
        }
        return (f6 == f4 || Float.isNaN(f6)) ? f4 : f6 > f4 ? C.z(f6, f3) : C.x(f6, -f3);
    }

    public void c() {
        this.f7737b = 1;
        this.f7741f = (s) this.f7740e;
        this.f7739d = 0;
    }

    public boolean d() {
        int[] iArr;
        C0697a c3 = ((s) this.f7741f).f7757b.c();
        int a3 = c3.a(6);
        if ((a3 == 0 || ((ByteBuffer) c3.f7787k).get(a3 + c3.f7784h) == 0) && this.f7738c != 65039) {
            return this.f7736a && ((iArr = (int[]) this.f7743h) == null || Arrays.binarySearch(iArr, ((s) this.f7741f).f7757b.a(0)) < 0);
        }
        return true;
    }

    public p(s sVar, boolean z3, int[] iArr) {
        this.f7737b = 1;
        this.f7740e = sVar;
        this.f7741f = sVar;
        this.f7736a = z3;
        this.f7743h = iArr;
    }
}
