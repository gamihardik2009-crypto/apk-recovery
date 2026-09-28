package b;

import java.util.ListIterator;
import m2.C0880v;
import n2.C0958j;

/* renamed from: b.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0492p extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f7024i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0499w f7025j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0492p(C0499w c0499w, int i2) {
        super(1);
        this.f7024i = i2;
        this.f7025j = c0499w;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.f7024i) {
            case 0:
                C0478b c0478b = (C0478b) obj;
                z2.h.f(c0478b, "backEvent");
                C0499w c0499w = this.f7025j;
                C0958j c0958j = c0499w.f7041b;
                ListIterator listIterator = c0958j.listIterator(c0958j.a());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((AbstractC0491o) obj2).f7021a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                AbstractC0491o abstractC0491o = (AbstractC0491o) obj2;
                if (c0499w.f7042c != null) {
                    c0499w.b();
                }
                c0499w.f7042c = abstractC0491o;
                if (abstractC0491o != null) {
                    abstractC0491o.d(c0478b);
                }
                break;
            default:
                C0478b c0478b2 = (C0478b) obj;
                z2.h.f(c0478b2, "backEvent");
                C0499w c0499w2 = this.f7025j;
                AbstractC0491o abstractC0491o2 = c0499w2.f7042c;
                if (abstractC0491o2 == null) {
                    C0958j c0958j2 = c0499w2.f7041b;
                    ListIterator listIterator2 = c0958j2.listIterator(c0958j2.a());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj3 = listIterator2.previous();
                            if (((AbstractC0491o) obj3).f7021a) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    abstractC0491o2 = (AbstractC0491o) obj3;
                }
                if (abstractC0491o2 != null) {
                    abstractC0491o2.c(c0478b2);
                }
                break;
        }
        return C0880v.f8657a;
    }
}
