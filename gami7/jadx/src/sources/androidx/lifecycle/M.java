package androidx.lifecycle;

import android.os.Bundle;
import b.AbstractActivityC0489m;
import b.C0487k;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import u1.InterfaceC1327d;

/* loaded from: classes.dex */
public final /* synthetic */ class M implements InterfaceC1327d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6845a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6846b;

    public /* synthetic */ M(int i2, Object obj) {
        this.f6845a = i2;
        this.f6846b = obj;
    }

    @Override // u1.InterfaceC1327d
    public final Bundle a() {
        switch (this.f6845a) {
            case 0:
                return N.a((N) this.f6846b);
            case 1:
                AbstractActivityC0489m abstractActivityC0489m = (AbstractActivityC0489m) this.f6846b;
                z2.h.f(abstractActivityC0489m, "this$0");
                Bundle bundle = new Bundle();
                C0487k c0487k = abstractActivityC0489m.f7008o;
                c0487k.getClass();
                LinkedHashMap linkedHashMap = c0487k.f6991b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(c0487k.f6993d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(c0487k.f6996g));
                return bundle;
            default:
                Map d3 = ((S.j) this.f6846b).d();
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry : d3.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle2.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle2;
        }
    }
}
