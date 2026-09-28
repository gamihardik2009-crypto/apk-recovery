package C1;

import B1.D;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class p extends B2.a {

    /* renamed from: p, reason: collision with root package name */
    public static final String f668p = B1.s.f("WorkContinuationImpl");

    /* renamed from: h, reason: collision with root package name */
    public final w f669h;

    /* renamed from: i, reason: collision with root package name */
    public final String f670i;

    /* renamed from: j, reason: collision with root package name */
    public final int f671j;

    /* renamed from: k, reason: collision with root package name */
    public final List f672k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f673l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f674m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public boolean f675n;

    /* renamed from: o, reason: collision with root package name */
    public B.z f676o;

    public p(w wVar, String str, int i2, List list) {
        this.f669h = wVar;
        this.f670i = str;
        this.f671j = i2;
        this.f672k = list;
        this.f673l = new ArrayList(list.size());
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (i2 == 1 && ((D) list.get(i3)).f252b.f4583u != Long.MAX_VALUE) {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            String uuid = ((D) list.get(i3)).f251a.toString();
            z2.h.e(uuid, "id.toString()");
            this.f673l.add(uuid);
            this.f674m.add(uuid);
        }
    }

    public static boolean J(p pVar, HashSet hashSet) {
        hashSet.addAll(pVar.f673l);
        HashSet K3 = K(pVar);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (K3.contains((String) it.next())) {
                return true;
            }
        }
        hashSet.removeAll(pVar.f673l);
        return false;
    }

    public static HashSet K(p pVar) {
        HashSet hashSet = new HashSet();
        pVar.getClass();
        return hashSet;
    }

    public final B1.A I() {
        if (this.f675n) {
            B1.s.d().g(f668p, "Already enqueued work ids (" + TextUtils.join(", ", this.f673l) + ")");
        } else {
            B.z zVar = new B.z(1);
            this.f669h.f691i.a(new L1.e(this, zVar));
            this.f676o = zVar;
        }
        return this.f676o;
    }
}
