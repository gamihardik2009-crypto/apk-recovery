package a2;

import D.O;
import W1.w;
import Y1.m;
import java.util.List;
import m2.C0880v;
import t.C1213h;

/* renamed from: a2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0448c implements y2.c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6500h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ List f6501i;

    public /* synthetic */ C0448c(int i2, List list) {
        this.f6500h = i2;
        this.f6501i = list;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        switch (this.f6500h) {
            case 0:
                C1213h c1213h = (C1213h) obj;
                List list = this.f6501i;
                z2.h.f(list, "$displayList");
                z2.h.f(c1213h, "$this$LazyColumn");
                c1213h.r(list.size(), new w(new C0448c(1, list), list, 3), new O(8, list), new R.a(-632812321, new m(1, list), true));
                return C0880v.f8657a;
            default:
                R1.g gVar = (R1.g) obj;
                List list2 = this.f6501i;
                z2.h.f(list2, "$displayList");
                z2.h.f(gVar, "it");
                return gVar.f5506a.f5496a + '_' + list2.indexOf(gVar);
        }
    }
}
