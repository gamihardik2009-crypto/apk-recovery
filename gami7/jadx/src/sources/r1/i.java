package r1;

import java.util.Iterator;
import java.util.List;
import w1.C1387i;

/* loaded from: classes.dex */
public abstract class i extends x {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(r rVar, int i2) {
        super(rVar);
        switch (i2) {
            case 1:
                z2.h.f(rVar, "database");
                super(rVar);
                break;
            default:
                z2.h.f(rVar, "database");
                break;
        }
    }

    public abstract void d(C1387i c1387i, Object obj);

    public void e(Object obj) {
        C1387i a3 = a();
        try {
            d(a3, obj);
            a3.b();
        } finally {
            c(a3);
        }
    }

    public void f(List list) {
        z2.h.f(list, "entities");
        C1387i a3 = a();
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                d(a3, it.next());
                a3.b();
            }
        } finally {
            c(a3);
        }
    }

    public void g(Object obj) {
        C1387i a3 = a();
        try {
            d(a3, obj);
            a3.a();
        } finally {
            c(a3);
        }
    }

    public void h(List list) {
        z2.h.f(list, "entities");
        C1387i a3 = a();
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                d(a3, it.next());
                a3.a();
            }
        } finally {
            c(a3);
        }
    }
}
