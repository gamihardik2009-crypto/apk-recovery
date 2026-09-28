package S;

import J.H;
import T.r;
import java.util.Map;
import l.C0805n;
import n1.C0945f;
import o1.o;

/* loaded from: classes.dex */
public final class g implements H {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5557a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5558b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5559c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5560d;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, int i2) {
        this.f5557a = i2;
        this.f5559c = obj;
        this.f5560d = obj2;
        this.f5558b = obj3;
    }

    @Override // J.H
    public final void a() {
        switch (this.f5557a) {
            case 0:
                h hVar = (h) this.f5560d;
                Map map = hVar.f5562a;
                f fVar = (f) this.f5559c;
                if (fVar.f5555b) {
                    Map d3 = fVar.f5556c.d();
                    boolean isEmpty = d3.isEmpty();
                    Object obj = fVar.f5554a;
                    if (isEmpty) {
                        map.remove(obj);
                    } else {
                        map.put(obj, d3);
                    }
                }
                hVar.f5563b.remove(this.f5558b);
                break;
            case 1:
                r rVar = (r) this.f5559c;
                Object obj2 = this.f5558b;
                rVar.remove(obj2);
                ((C0805n) this.f5560d).f8228d.g(obj2);
                break;
            default:
                n1.i b3 = ((o) this.f5559c).b();
                C0945f c0945f = (C0945f) this.f5560d;
                b3.b(c0945f);
                ((r) this.f5558b).remove(c0945f);
                break;
        }
    }

    public g(r rVar, Object obj, C0805n c0805n) {
        this.f5557a = 1;
        this.f5559c = rVar;
        this.f5558b = obj;
        this.f5560d = c0805n;
    }
}
