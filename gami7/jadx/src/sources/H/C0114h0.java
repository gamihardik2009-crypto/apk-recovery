package H;

import J.C0285q;
import a.AbstractC0423a;
import c0.C0578S;
import c0.C0603v;
import com.example.bulksmsscheduler.R;
import i0.AbstractC0732y;
import i0.C0711d;
import i0.C0712e;
import i0.C0715h;
import i0.C0718k;
import i0.C0719l;
import i0.C0723p;
import java.util.ArrayList;
import m.AbstractC0831e;
import m2.C0880v;
import n2.AbstractC0963o;
import r0.InterfaceC1093G;
import s.AbstractC1166e;

/* renamed from: H.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0114h0 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2659i;

    /* renamed from: j, reason: collision with root package name */
    public static final C0114h0 f2643j = new C0114h0(2, 0);

    /* renamed from: k, reason: collision with root package name */
    public static final C0114h0 f2644k = new C0114h0(2, 1);

    /* renamed from: l, reason: collision with root package name */
    public static final C0114h0 f2645l = new C0114h0(2, 2);

    /* renamed from: m, reason: collision with root package name */
    public static final C0114h0 f2646m = new C0114h0(2, 3);

    /* renamed from: n, reason: collision with root package name */
    public static final C0114h0 f2647n = new C0114h0(2, 4);

    /* renamed from: o, reason: collision with root package name */
    public static final C0114h0 f2648o = new C0114h0(2, 5);

    /* renamed from: p, reason: collision with root package name */
    public static final C0114h0 f2649p = new C0114h0(2, 6);
    public static final C0114h0 q = new C0114h0(2, 7);

    /* renamed from: r, reason: collision with root package name */
    public static final C0114h0 f2650r = new C0114h0(2, 8);

    /* renamed from: s, reason: collision with root package name */
    public static final C0114h0 f2651s = new C0114h0(2, 9);

    /* renamed from: t, reason: collision with root package name */
    public static final C0114h0 f2652t = new C0114h0(2, 10);

    /* renamed from: u, reason: collision with root package name */
    public static final C0114h0 f2653u = new C0114h0(2, 11);

    /* renamed from: v, reason: collision with root package name */
    public static final C0114h0 f2654v = new C0114h0(2, 12);

    /* renamed from: w, reason: collision with root package name */
    public static final C0114h0 f2655w = new C0114h0(2, 13);

    /* renamed from: x, reason: collision with root package name */
    public static final C0114h0 f2656x = new C0114h0(2, 14);

    /* renamed from: y, reason: collision with root package name */
    public static final C0114h0 f2657y = new C0114h0(2, 15);

    /* renamed from: z, reason: collision with root package name */
    public static final C0114h0 f2658z = new C0114h0(2, 16);

    /* renamed from: A, reason: collision with root package name */
    public static final C0114h0 f2635A = new C0114h0(2, 17);

    /* renamed from: B, reason: collision with root package name */
    public static final C0114h0 f2636B = new C0114h0(2, 18);

    /* renamed from: C, reason: collision with root package name */
    public static final C0114h0 f2637C = new C0114h0(2, 19);

    /* renamed from: D, reason: collision with root package name */
    public static final C0114h0 f2638D = new C0114h0(2, 20);
    public static final C0114h0 E = new C0114h0(2, 21);
    public static final C0114h0 F = new C0114h0(2, 22);

    /* renamed from: G, reason: collision with root package name */
    public static final C0114h0 f2639G = new C0114h0(2, 23);

    /* renamed from: H, reason: collision with root package name */
    public static final C0114h0 f2640H = new C0114h0(2, 24);

    /* renamed from: I, reason: collision with root package name */
    public static final C0114h0 f2641I = new C0114h0(2, 25);

    /* renamed from: J, reason: collision with root package name */
    public static final C0114h0 f2642J = new C0114h0(2, 26);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0114h0(int i2, int i3) {
        super(i2);
        this.f2659i = i3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        C0712e c0712e;
        C0712e c0712e2;
        C0880v c0880v = C0880v.f8657a;
        switch (this.f2659i) {
            case 0:
                C0285q c0285q = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q.A()) {
                    c0285q.P();
                }
                return c0880v;
            case 1:
                C0285q c0285q2 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q2.A()) {
                    c0285q2.P();
                } else {
                    AbstractC0088d2.a(AbstractC0423a.M(), D1.w(R.string.m3c_date_picker_switch_to_input_mode, c0285q2), null, 0L, c0285q2, 0, 12);
                }
                return c0880v;
            case 2:
                C0285q c0285q3 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q3.A()) {
                    c0285q3.P();
                } else {
                    AbstractC0088d2.a(C1.y.w(), D1.w(R.string.m3c_date_picker_switch_to_calendar_mode, c0285q3), null, 0L, c0285q3, 0, 12);
                }
                return c0880v;
            case 3:
                C0285q c0285q4 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q4.A()) {
                    c0285q4.P();
                } else {
                    C0712e c0712e3 = B2.a.f315a;
                    if (c0712e3 != null) {
                        c0712e = c0712e3;
                    } else {
                        C0711d c0711d = new C0711d("AutoMirrored.Filled.KeyboardArrowLeft", true);
                        int i2 = AbstractC0732y.f7958a;
                        C0578S c0578s = new C0578S(C0603v.f7272b);
                        ArrayList arrayList = new ArrayList(32);
                        arrayList.add(new C0719l(15.41f, 16.59f));
                        arrayList.add(new C0718k(10.83f, 12.0f));
                        arrayList.add(new C0723p(4.58f, -4.59f));
                        arrayList.add(new C0718k(14.0f, 6.0f));
                        arrayList.add(new C0723p(-6.0f, 6.0f));
                        arrayList.add(new C0723p(6.0f, 6.0f));
                        arrayList.add(new C0723p(1.41f, -1.41f));
                        arrayList.add(C0715h.f7902b);
                        C0711d.a(c0711d, arrayList, c0578s);
                        C0712e b3 = c0711d.b();
                        B2.a.f315a = b3;
                        c0712e = b3;
                    }
                    AbstractC0088d2.a(c0712e, D1.w(R.string.m3c_date_picker_switch_to_previous_month, c0285q4), null, 0L, c0285q4, 0, 12);
                }
                return c0880v;
            case 4:
                C0285q c0285q5 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q5.A()) {
                    c0285q5.P();
                } else {
                    C0712e c0712e4 = C1.y.f699a;
                    if (c0712e4 != null) {
                        c0712e2 = c0712e4;
                    } else {
                        C0711d c0711d2 = new C0711d("AutoMirrored.Filled.KeyboardArrowRight", true);
                        int i3 = AbstractC0732y.f7958a;
                        C0578S c0578s2 = new C0578S(C0603v.f7272b);
                        ArrayList arrayList2 = new ArrayList(32);
                        arrayList2.add(new C0719l(8.59f, 16.59f));
                        arrayList2.add(new C0718k(13.17f, 12.0f));
                        arrayList2.add(new C0718k(8.59f, 7.41f));
                        arrayList2.add(new C0718k(10.0f, 6.0f));
                        arrayList2.add(new C0723p(6.0f, 6.0f));
                        arrayList2.add(new C0723p(-6.0f, 6.0f));
                        arrayList2.add(new C0723p(-1.41f, -1.41f));
                        arrayList2.add(C0715h.f7902b);
                        C0711d.a(c0711d2, arrayList2, c0578s2);
                        C0712e b4 = c0711d2.b();
                        C1.y.f699a = b4;
                        c0712e2 = b4;
                    }
                    AbstractC0088d2.a(c0712e2, D1.w(R.string.m3c_date_picker_switch_to_next_month, c0285q5), null, 0L, c0285q5, 0, 12);
                }
                return c0880v;
            case AbstractC1166e.f10138f /* 5 */:
                C0285q c0285q6 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q6.A()) {
                    c0285q6.P();
                }
                return c0880v;
            case AbstractC1166e.f10136d /* 6 */:
                C0285q c0285q7 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q7.A()) {
                    c0285q7.P();
                }
                return c0880v;
            case 7:
                C0285q c0285q8 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q8.A()) {
                    c0285q8.P();
                }
                return c0880v;
            case 8:
                C0285q c0285q9 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q9.A()) {
                    c0285q9.P();
                }
                return c0880v;
            case AbstractC1166e.f10135c /* 9 */:
                C0285q c0285q10 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q10.A()) {
                    c0285q10.P();
                }
                return c0880v;
            case AbstractC1166e.f10137e /* 10 */:
                C0285q c0285q11 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q11.A()) {
                    c0285q11.P();
                }
                return c0880v;
            case 11:
                C0285q c0285q12 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q12.A()) {
                    c0285q12.P();
                }
                return c0880v;
            case 12:
                C0285q c0285q13 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q13.A()) {
                    c0285q13.P();
                }
                return c0880v;
            case 13:
                C0285q c0285q14 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q14.A()) {
                    c0285q14.P();
                } else {
                    AbstractC0088d2.a(B2.a.s(), D1.w(R.string.m3c_snackbar_dismiss, c0285q14), null, 0L, c0285q14, 0, 12);
                }
                return c0880v;
            case 14:
                C0285q c0285q15 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q15.A()) {
                    c0285q15.P();
                } else {
                    D1.d(null, 0.0f, 0L, c0285q15, 0, 7);
                }
                return c0880v;
            case AbstractC1166e.f10139g /* 15 */:
                C0285q c0285q16 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q16.A()) {
                    c0285q16.P();
                } else {
                    D1.d(null, 0.0f, 0L, c0285q16, 0, 7);
                }
                return c0880v;
            case 16:
                long j3 = ((O0.j) obj).f5147a;
                long j4 = ((O0.j) obj2).f5147a;
                return AbstractC0831e.n(500, 0, I.q.f3742b, 2);
            case 17:
                B1 b12 = (B1) obj2;
                Long b5 = b12.b();
                Long valueOf = Long.valueOf(((K) b12.f1342d.getValue()).f1657e);
                E2.d dVar = b12.f1339a;
                return AbstractC0963o.v(b5, valueOf, Integer.valueOf(dVar.f1076h), Integer.valueOf(dVar.f1077i), Integer.valueOf(b12.a()));
            case 18:
                return Integer.valueOf(((InterfaceC1093G) obj).b(((Number) obj2).intValue()));
            case 19:
                return Integer.valueOf(((InterfaceC1093G) obj).a0(((Number) obj2).intValue()));
            case 20:
                return Integer.valueOf(((InterfaceC1093G) obj).b0(((Number) obj2).intValue()));
            case 21:
                return Integer.valueOf(((InterfaceC1093G) obj).L(((Number) obj2).intValue()));
            case 22:
                return Integer.valueOf(((InterfaceC1093G) obj).b(((Number) obj2).intValue()));
            case 23:
                return Integer.valueOf(((InterfaceC1093G) obj).a0(((Number) obj2).intValue()));
            case 24:
                return Integer.valueOf(((InterfaceC1093G) obj).b0(((Number) obj2).intValue()));
            case 25:
                return Integer.valueOf(((InterfaceC1093G) obj).L(((Number) obj2).intValue()));
            default:
                M5 m5 = (M5) obj2;
                return AbstractC0963o.v(Integer.valueOf(m5.b()), Integer.valueOf(m5.d()), Boolean.valueOf(m5.f1753a));
        }
    }
}
