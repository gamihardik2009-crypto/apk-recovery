package H;

import java.util.ArrayList;
import java.util.List;
import m2.C0880v;
import r0.AbstractC1102P;
import r0.AbstractC1103Q;

/* renamed from: H.h3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0117h3 extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ List f2669i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ List f2670j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ List f2671k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List f2672l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ J1 f2673m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2674n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f2675o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ s.Y f2676p;
    public final /* synthetic */ r0.a0 q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2677r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2678s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Integer f2679t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ List f2680u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Integer f2681v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0117h3(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, J1 j12, int i2, int i3, s.Y y3, r0.a0 a0Var, int i4, int i5, Integer num, ArrayList arrayList5, Integer num2) {
        super(1);
        this.f2669i = arrayList;
        this.f2670j = arrayList2;
        this.f2671k = arrayList3;
        this.f2672l = arrayList4;
        this.f2673m = j12;
        this.f2674n = i2;
        this.f2675o = i3;
        this.f2676p = y3;
        this.q = a0Var;
        this.f2677r = i4;
        this.f2678s = i5;
        this.f2679t = num;
        this.f2680u = arrayList5;
        this.f2681v = num2;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        int i2;
        AbstractC1102P abstractC1102P = (AbstractC1102P) obj;
        List list = this.f2669i;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC1102P.d(abstractC1102P, (AbstractC1103Q) list.get(i3), 0, 0);
        }
        List list2 = this.f2670j;
        int size2 = list2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            AbstractC1102P.d(abstractC1102P, (AbstractC1103Q) list2.get(i4), 0, 0);
        }
        List list3 = this.f2671k;
        int size3 = list3.size();
        int i5 = 0;
        while (true) {
            i2 = this.f2677r;
            if (i5 >= size3) {
                break;
            }
            AbstractC1103Q abstractC1103Q = (AbstractC1103Q) list3.get(i5);
            int i6 = (this.f2674n - this.f2675o) / 2;
            r0.a0 a0Var = this.q;
            AbstractC1102P.d(abstractC1102P, abstractC1103Q, this.f2676p.a(a0Var, a0Var.getLayoutDirection()) + i6, i2 - this.f2678s);
            i5++;
        }
        List list4 = this.f2672l;
        int size4 = list4.size();
        for (int i7 = 0; i7 < size4; i7++) {
            AbstractC1103Q abstractC1103Q2 = (AbstractC1103Q) list4.get(i7);
            Integer num = this.f2679t;
            AbstractC1102P.d(abstractC1102P, abstractC1103Q2, 0, i2 - (num != null ? num.intValue() : 0));
        }
        J1 j12 = this.f2673m;
        if (j12 != null) {
            List list5 = this.f2680u;
            int size5 = list5.size();
            for (int i8 = 0; i8 < size5; i8++) {
                AbstractC1103Q abstractC1103Q3 = (AbstractC1103Q) list5.get(i8);
                Integer num2 = this.f2681v;
                z2.h.c(num2);
                AbstractC1102P.d(abstractC1102P, abstractC1103Q3, j12.f1618a, i2 - num2.intValue());
            }
        }
        return C0880v.f8657a;
    }
}
