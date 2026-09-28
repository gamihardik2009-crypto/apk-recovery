package H;

import I.AbstractC0238c;
import J.C0285q;
import c0.AbstractC0571K;
import c0.C0603v;
import m.AbstractC0837j;
import s.AbstractC1166e;

/* renamed from: H.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0107g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final J.X0 f2597a = new J.X0(C0100f0.f2559j);

    /* renamed from: b, reason: collision with root package name */
    public static final J.X0 f2598b = new J.X0(C0100f0.f2560k);

    public static final long a(C0093e0 c0093e0, long j3) {
        if (C0603v.c(j3, c0093e0.f2483a)) {
            return c0093e0.f2484b;
        }
        if (C0603v.c(j3, c0093e0.f2488f)) {
            return c0093e0.f2489g;
        }
        if (C0603v.c(j3, c0093e0.f2492j)) {
            return c0093e0.f2493k;
        }
        if (C0603v.c(j3, c0093e0.f2496n)) {
            return c0093e0.f2497o;
        }
        if (C0603v.c(j3, c0093e0.f2504w)) {
            return c0093e0.f2505x;
        }
        if (C0603v.c(j3, c0093e0.f2485c)) {
            return c0093e0.f2486d;
        }
        if (C0603v.c(j3, c0093e0.f2490h)) {
            return c0093e0.f2491i;
        }
        if (C0603v.c(j3, c0093e0.f2494l)) {
            return c0093e0.f2495m;
        }
        if (C0603v.c(j3, c0093e0.f2506y)) {
            return c0093e0.f2507z;
        }
        if (C0603v.c(j3, c0093e0.f2502u)) {
            return c0093e0.f2503v;
        }
        boolean c3 = C0603v.c(j3, c0093e0.f2498p);
        long j4 = c0093e0.q;
        if (!c3) {
            if (C0603v.c(j3, c0093e0.f2499r)) {
                return c0093e0.f2500s;
            }
            if (!C0603v.c(j3, c0093e0.f2462D) && !C0603v.c(j3, c0093e0.F) && !C0603v.c(j3, c0093e0.f2463G) && !C0603v.c(j3, c0093e0.f2464H) && !C0603v.c(j3, c0093e0.f2465I) && !C0603v.c(j3, c0093e0.f2466J)) {
                int i2 = C0603v.f7278h;
                return C0603v.f7277g;
            }
        }
        return j4;
    }

    public static final long b(long j3, C0285q c0285q) {
        long a3 = a((C0093e0) c0285q.l(f2597a), j3);
        return a3 != C0603v.f7277g ? a3 : ((C0603v) c0285q.l(AbstractC0183r0.f3050a)).f7279a;
    }

    public static final long c(C0093e0 c0093e0, int i2) {
        switch (AbstractC0837j.d(i2)) {
            case 0:
                return c0093e0.f2496n;
            case 1:
                return c0093e0.f2504w;
            case 2:
                return c0093e0.f2506y;
            case 3:
                return c0093e0.f2503v;
            case 4:
                return c0093e0.f2487e;
            case AbstractC1166e.f10138f /* 5 */:
                return c0093e0.f2502u;
            case AbstractC1166e.f10136d /* 6 */:
                return c0093e0.f2497o;
            case 7:
                return c0093e0.f2505x;
            case 8:
                return c0093e0.f2507z;
            case AbstractC1166e.f10135c /* 9 */:
                return c0093e0.f2484b;
            case AbstractC1166e.f10137e /* 10 */:
                return c0093e0.f2486d;
            case 11:
            case 12:
            case AbstractC1166e.f10139g /* 15 */:
            case 16:
            case 21:
            case 22:
            case 27:
            case 28:
            case 32:
            case 33:
            default:
                return C0603v.f7277g;
            case 13:
                return c0093e0.f2489g;
            case 14:
                return c0093e0.f2491i;
            case 17:
                return c0093e0.q;
            case 18:
                return c0093e0.f2500s;
            case 19:
                return c0093e0.f2493k;
            case 20:
                return c0093e0.f2495m;
            case 23:
                return c0093e0.f2459A;
            case 24:
                return c0093e0.f2460B;
            case 25:
                return c0093e0.f2483a;
            case 26:
                return c0093e0.f2485c;
            case 29:
                return c0093e0.f2461C;
            case 30:
                return c0093e0.f2488f;
            case 31:
                return c0093e0.f2490h;
            case 34:
                return c0093e0.f2498p;
            case 35:
                return c0093e0.f2462D;
            case 36:
                return c0093e0.F;
            case 37:
                return c0093e0.f2463G;
            case 38:
                return c0093e0.f2464H;
            case 39:
                return c0093e0.f2465I;
            case 40:
                return c0093e0.f2466J;
            case 41:
                return c0093e0.E;
            case 42:
                return c0093e0.f2501t;
            case 43:
                return c0093e0.f2499r;
            case 44:
                return c0093e0.f2492j;
            case 45:
                return c0093e0.f2494l;
        }
    }

    public static final long d(int i2, C0285q c0285q) {
        return c((C0093e0) c0285q.l(f2597a), i2);
    }

    public static C0093e0 e(long j3, long j4, long j5, long j6, long j7, long j8, long j9, int i2) {
        long j10 = (i2 & 1) != 0 ? AbstractC0238c.f3626t : j3;
        return new C0093e0(j10, AbstractC0238c.f3617j, AbstractC0238c.f3627u, AbstractC0238c.f3618k, AbstractC0238c.f3612e, (i2 & 32) != 0 ? AbstractC0238c.f3629w : j4, AbstractC0238c.f3619l, AbstractC0238c.f3630x, AbstractC0238c.f3620m, AbstractC0238c.f3606H, AbstractC0238c.f3623p, AbstractC0238c.f3607I, AbstractC0238c.q, (i2 & 8192) != 0 ? AbstractC0238c.f3608a : j5, AbstractC0238c.f3614g, (32768 & i2) != 0 ? AbstractC0238c.f3631y : j6, (65536 & i2) != 0 ? AbstractC0238c.f3621n : j7, AbstractC0238c.f3605G, (262144 & i2) != 0 ? AbstractC0238c.f3622o : j8, j10, AbstractC0238c.f3613f, AbstractC0238c.f3611d, (i2 & 4194304) != 0 ? AbstractC0238c.f3609b : j9, AbstractC0238c.f3615h, AbstractC0238c.f3610c, AbstractC0238c.f3616i, AbstractC0238c.f3624r, AbstractC0238c.f3625s, AbstractC0238c.f3628v, AbstractC0238c.f3632z, AbstractC0238c.F, AbstractC0238c.f3601A, AbstractC0238c.f3602B, AbstractC0238c.f3603C, AbstractC0238c.f3604D, AbstractC0238c.E);
    }

    public static final long f(C0093e0 c0093e0, float f3) {
        return O0.e.a(f3, (float) 0) ? c0093e0.f2498p : AbstractC0571K.k(C0603v.b(((((float) Math.log(f3 + 1)) * 4.5f) + 2.0f) / 100.0f, c0093e0.f2501t), c0093e0.f2498p);
    }
}
