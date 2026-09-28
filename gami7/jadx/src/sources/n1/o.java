package n1;

import android.net.Uri;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m2.C0865g;
import n2.AbstractC0961m;
import s.AbstractC1166e;

/* loaded from: classes.dex */
public final class o extends z2.i implements y2.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f9063i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q f9064j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(q qVar, int i2) {
        super(0);
        this.f9063i = i2;
        this.f9064j = qVar;
    }

    @Override // y2.a
    public final Object c() {
        List list;
        switch (this.f9063i) {
            case 0:
                C0865g c0865g = (C0865g) this.f9064j.f9076h.getValue();
                return (c0865g == null || (list = (List) c0865g.f8646h) == null) ? new ArrayList() : list;
            case 1:
                String str = this.f9064j.f9069a;
                if (str == null || Uri.parse(str).getFragment() == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                String fragment = Uri.parse(str).getFragment();
                StringBuilder sb = new StringBuilder();
                z2.h.c(fragment);
                q.a(fragment, arrayList, sb);
                String sb2 = sb.toString();
                z2.h.e(sb2, "fragRegex.toString()");
                return new C0865g(arrayList, sb2);
            case 2:
                String str2 = (String) this.f9064j.f9078j.getValue();
                if (str2 != null) {
                    return Pattern.compile(str2, 2);
                }
                return null;
            case 3:
                C0865g c0865g2 = (C0865g) this.f9064j.f9076h.getValue();
                if (c0865g2 != null) {
                    return (String) c0865g2.f8647i;
                }
                return null;
            case 4:
                String str3 = this.f9064j.f9069a;
                return Boolean.valueOf((str3 == null || Uri.parse(str3).getQuery() == null) ? false : true);
            case AbstractC1166e.f10138f /* 5 */:
                this.f9064j.getClass();
                return null;
            case AbstractC1166e.f10136d /* 6 */:
                String str4 = this.f9064j.f9071c;
                if (str4 != null) {
                    return Pattern.compile(str4, 2);
                }
                return null;
            default:
                q qVar = this.f9064j;
                qVar.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (((Boolean) qVar.f9073e.getValue()).booleanValue()) {
                    String str5 = qVar.f9069a;
                    Uri parse = Uri.parse(str5);
                    for (String str6 : parse.getQueryParameterNames()) {
                        StringBuilder sb3 = new StringBuilder();
                        List<String> queryParameters = parse.getQueryParameters(str6);
                        if (queryParameters.size() > 1) {
                            throw new IllegalArgumentException(("Query parameter " + str6 + " must only be present once in " + str5 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                        }
                        String str7 = (String) AbstractC0961m.H(queryParameters);
                        if (str7 == null) {
                            qVar.f9075g = true;
                            str7 = str6;
                        }
                        Matcher matcher = q.f9068n.matcher(str7);
                        n nVar = new n();
                        int i2 = 0;
                        while (matcher.find()) {
                            String group = matcher.group(1);
                            z2.h.d(group, "null cannot be cast to non-null type kotlin.String");
                            nVar.f9062b.add(group);
                            z2.h.e(str7, "queryParam");
                            String substring = str7.substring(i2, matcher.start());
                            z2.h.e(substring, "substring(...)");
                            sb3.append(Pattern.quote(substring));
                            sb3.append("(.+?)?");
                            i2 = matcher.end();
                        }
                        if (i2 < str7.length()) {
                            String substring2 = str7.substring(i2);
                            z2.h.e(substring2, "substring(...)");
                            sb3.append(Pattern.quote(substring2));
                        }
                        String sb4 = sb3.toString();
                        z2.h.e(sb4, "argRegex.toString()");
                        nVar.f9061a = H2.l.b0(sb4, ".*", "\\E.*\\Q");
                        z2.h.e(str6, "paramName");
                        linkedHashMap.put(str6, nVar);
                    }
                }
                return linkedHashMap;
        }
    }
}
