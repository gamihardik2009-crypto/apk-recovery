package n1;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m2.C0865g;
import m2.C0870l;
import m2.C0880v;
import m2.EnumC0863e;
import m2.InterfaceC0862d;
import n2.AbstractC0962n;
import n2.AbstractC0963o;
import n2.AbstractC0964p;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f9067m = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: n, reason: collision with root package name */
    public static final Pattern f9068n = Pattern.compile("\\{(.+?)\\}");

    /* renamed from: a, reason: collision with root package name */
    public final String f9069a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f9070b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9071c;

    /* renamed from: d, reason: collision with root package name */
    public final C0870l f9072d;

    /* renamed from: e, reason: collision with root package name */
    public final C0870l f9073e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0862d f9074f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9075g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC0862d f9076h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC0862d f9077i;

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC0862d f9078j;

    /* renamed from: k, reason: collision with root package name */
    public final C0870l f9079k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f9080l;

    public q(String str) {
        this.f9069a = str;
        ArrayList arrayList = new ArrayList();
        this.f9070b = arrayList;
        this.f9072d = new C0870l(new o(this, 6));
        this.f9073e = new C0870l(new o(this, 4));
        EnumC0863e enumC0863e = EnumC0863e.f8644i;
        this.f9074f = B2.a.x(enumC0863e, new o(this, 7));
        this.f9076h = B2.a.x(enumC0863e, new o(this, 1));
        this.f9077i = B2.a.x(enumC0863e, new o(this, 0));
        this.f9078j = B2.a.x(enumC0863e, new o(this, 3));
        this.f9079k = new C0870l(new o(this, 2));
        new C0870l(new o(this, 5));
        if (str == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("^");
        if (!f9067m.matcher(str).find()) {
            sb.append("http[s]?://");
        }
        Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(str);
        matcher.find();
        boolean z3 = false;
        String substring = str.substring(0, matcher.start());
        z2.h.e(substring, "substring(...)");
        a(substring, arrayList, sb);
        if (!H2.l.O(sb, ".*", false) && !H2.l.O(sb, "([^/]+?)", false)) {
            z3 = true;
        }
        this.f9080l = z3;
        sb.append("($|(\\?(.)*)|(\\#(.)*))");
        String sb2 = sb.toString();
        z2.h.e(sb2, "uriRegex.toString()");
        this.f9071c = H2.l.b0(sb2, ".*", "\\E.*\\Q");
    }

    public static void a(String str, List list, StringBuilder sb) {
        Matcher matcher = f9068n.matcher(str);
        int i2 = 0;
        while (matcher.find()) {
            String group = matcher.group(1);
            z2.h.d(group, "null cannot be cast to non-null type kotlin.String");
            list.add(group);
            if (matcher.start() > i2) {
                String substring = str.substring(i2, matcher.start());
                z2.h.e(substring, "substring(...)");
                sb.append(Pattern.quote(substring));
            }
            sb.append("([^/]*?|)");
            i2 = matcher.end();
        }
        if (i2 < str.length()) {
            String substring2 = str.substring(i2);
            z2.h.e(substring2, "substring(...)");
            sb.append(Pattern.quote(substring2));
        }
    }

    public final boolean b(Matcher matcher, Bundle bundle, LinkedHashMap linkedHashMap) {
        ArrayList arrayList = this.f9070b;
        ArrayList arrayList2 = new ArrayList(AbstractC0964p.z(arrayList, 10));
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC0963o.y();
                throw null;
            }
            String str = (String) next;
            String decode = Uri.decode(matcher.group(i3));
            B1.t.w(linkedHashMap.get(str));
            try {
                z2.h.e(decode, "value");
                bundle.putString(str, decode);
                arrayList2.add(C0880v.f8657a);
                i2 = i3;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c(Uri uri, Bundle bundle, LinkedHashMap linkedHashMap) {
        Object obj;
        String query;
        for (Map.Entry entry : ((Map) this.f9074f.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            n nVar = (n) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (this.f9075g && (query = uri.getQuery()) != null && !z2.h.a(query, uri.toString())) {
                queryParameters = AbstractC0962n.l(query);
            }
            z2.h.e(queryParameters, "inputParams");
            C0880v c0880v = C0880v.f8657a;
            int i2 = 0;
            Bundle i3 = B2.a.i(new C0865g[0]);
            Iterator it = nVar.f9062b.iterator();
            while (it.hasNext()) {
                B1.t.w(linkedHashMap.get((String) it.next()));
            }
            for (String str2 : queryParameters) {
                String str3 = nVar.f9061a;
                Matcher matcher = str3 != null ? Pattern.compile(str3, 32).matcher(str2) : null;
                if (matcher == null || !matcher.matches()) {
                    return i2;
                }
                ArrayList arrayList = nVar.f9062b;
                ArrayList arrayList2 = new ArrayList(AbstractC0964p.z(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                int i4 = i2;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        AbstractC0963o.y();
                        throw null;
                    }
                    String str4 = (String) next;
                    String group = matcher.group(i5);
                    if (group == null) {
                        group = "";
                    }
                    B1.t.w(linkedHashMap.get(str4));
                    if (i3.containsKey(str4)) {
                        obj = Boolean.valueOf(!i3.containsKey(str4));
                        arrayList2.add(obj);
                        i4 = i5;
                        i2 = 0;
                    } else {
                        i3.putString(str4, group);
                        obj = c0880v;
                        arrayList2.add(obj);
                        i4 = i5;
                        i2 = 0;
                    }
                }
            }
            bundle.putAll(i3);
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof q)) {
            return false;
        }
        return z2.h.a(this.f9069a, ((q) obj).f9069a) && z2.h.a(null, null) && z2.h.a(null, null);
    }

    public final int hashCode() {
        String str = this.f9069a;
        return (str != null ? str.hashCode() : 0) * 961;
    }
}
