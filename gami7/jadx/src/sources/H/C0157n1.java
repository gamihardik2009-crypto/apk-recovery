package H;

import J.C0257c;
import J.C0285q;
import J.C0287r0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import m2.C0880v;
import n2.AbstractC0946A;
import n2.AbstractC0948C;
import o.C0976b;
import o.C0983i;
import s.AbstractC1166e;
import u0.C1314v;

/* renamed from: H.n1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0157n1 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2924i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f2925j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f2926k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f2927l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0157n1(int i2, int i3, Object obj, Object obj2) {
        super(2);
        this.f2924i = i3;
        this.f2926k = obj;
        this.f2927l = obj2;
        this.f2925j = i2;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        switch (this.f2924i) {
            case 0:
                ((Number) obj2).intValue();
                int Y2 = C0257c.Y(this.f2925j | 1);
                A1.i((B0) this.f2926k, (I) this.f2927l, (C0285q) obj, Y2);
                break;
            case 1:
                ((Number) obj2).intValue();
                int Y3 = C0257c.Y(this.f2925j | 1);
                O4.d((y2.e) this.f2926k, (y2.e) this.f2927l, (C0285q) obj, Y3);
                break;
            case 2:
                ((Number) obj2).intValue();
                int Y4 = C0257c.Y(this.f2925j | 1);
                t5.a((C0.K) this.f2926k, (y2.e) this.f2927l, (C0285q) obj, Y4);
                break;
            case 3:
                ((Number) obj2).intValue();
                C0287r0[] c0287r0Arr = (C0287r0[]) this.f2926k;
                C0287r0[] c0287r0Arr2 = (C0287r0[]) Arrays.copyOf(c0287r0Arr, c0287r0Arr.length);
                int Y5 = C0257c.Y(this.f2925j | 1);
                C0257c.b(c0287r0Arr2, (y2.e) this.f2927l, (C0285q) obj, Y5);
                break;
            case 4:
                ((Number) obj2).intValue();
                int Y6 = C0257c.Y(this.f2925j | 1);
                C0257c.a((C0287r0) this.f2926k, (y2.e) this.f2927l, (C0285q) obj, Y6);
                break;
            case AbstractC1166e.f10138f /* 5 */:
                ((Number) obj2).intValue();
                int Y7 = C0257c.Y(this.f2925j) | 1;
                ((R.a) this.f2926k).a(this.f2927l, (C0285q) obj, Y7);
                break;
            case AbstractC1166e.f10136d /* 6 */:
                ((Number) obj2).intValue();
                int Y8 = C0257c.Y(this.f2925j | 1);
                ((m.p0) this.f2926k).a(this.f2927l, (C0285q) obj, Y8);
                break;
            case 7:
                ((Number) obj2).intValue();
                int Y9 = C0257c.Y(this.f2925j | 1);
                B1.C.a((V.o) this.f2926k, (y2.c) this.f2927l, (C0285q) obj, Y9);
                break;
            case 8:
                ((Number) obj2).intValue();
                int Y10 = C0257c.Y(this.f2925j | 1);
                ((C0983i) this.f2926k).a((C0976b) this.f2927l, (C0285q) obj, Y10);
                break;
            case AbstractC1166e.f10135c /* 9 */:
                ((Number) obj2).intValue();
                int Y11 = C0257c.Y(this.f2925j | 1);
                AbstractC0946A.b((List) this.f2926k, (Collection) this.f2927l, (C0285q) obj, Y11);
                break;
            case AbstractC1166e.f10137e /* 10 */:
                ((Number) obj2).intValue();
                int Y12 = C0257c.Y(this.f2925j | 1);
                AbstractC0948C.c((S.c) this.f2926k, (y2.e) this.f2927l, (C0285q) obj, Y12);
                break;
            case 11:
                ((Number) obj2).intValue();
                int Y13 = C0257c.Y(this.f2925j | 1);
                AndroidCompositionLocals_androidKt.a((C1314v) this.f2926k, (y2.e) this.f2927l, (C0285q) obj, Y13);
                break;
            case 12:
                C0285q c0285q = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q.A()) {
                    c0285q.P();
                } else {
                    ((v.x) this.f2926k).e(this.f2925j, this.f2927l, c0285q, 0);
                }
                break;
            default:
                ((Number) obj2).intValue();
                int Y14 = C0257c.Y(this.f2925j | 1);
                z.N.b((D.X) this.f2926k, (y2.e) this.f2927l, (C0285q) obj, Y14);
                break;
        }
        return C0880v.f8657a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0157n1(int i2, Object obj, v.x xVar) {
        super(2);
        this.f2924i = 12;
        this.f2926k = xVar;
        this.f2925j = i2;
        this.f2927l = obj;
    }
}
